/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);
const playBtn = $('.btn-toggle-play');
const repeatBtn = $('.btn-repeat');
const player = $('.player');
const nextBtn = $('.btn-next');
const prevBtn = $('.btn-prev');
const randomBtn = $('.btn-random');
const sideBar = $('.sideBar');
const sideBarTime = $('.sideBar-time');

const songItem = Array.from($$('.song-item'));
const audio = $('#audio');

const app = {
    currentIndex: 0,

    listSong: songItem.map((song) => {
        return {
            id: song.dataset.id,
            name: song.dataset.name,
            path: song.dataset.path,
        };
    }),

    defineProperties: function () {
        Object.defineProperty(this, 'currentSong', {
            get: function () {
                return this.listSong[this.currentIndex];
            }
        })
    },

    //hàm lắng nghe / xử lí các sự kiện
    handleEvent: function () {

        //Xử lí khi click play/pause
        playBtn.onclick = function () {
            if (app.isPlaying === true) {
                audio.pause();
            } else {
                audio.play();
            }

        };
        //Play
        audio.onplay = function () {
            app.isPlaying = true;
            playBtn.classList.add('playing');
        };
        //Pause
        audio.onpause = function () {
            app.isPlaying = false;
            playBtn.classList.remove('playing');
        };
        //Khi next song
        nextBtn.onclick = function () {
            if (app.isRandom) {
                app.randomSong();
            } else {
                app.nextSong();

            }
            audio.play();
        };

        //Khi prev song
        prevBtn.onclick = function () {
            if (app.isRandom) {
                app.randomSong();
            } else {
                app.prevSong();

            }
            audio.play();
        };
        //repeatSong
        repeatBtn.onclick = function () {
            app.isRepeat = !app.isRepeat;
            repeatBtn.classList.toggle('active', app.isRepeat);
        };
        //Xử lí next song khi ended
        audio.onended = function () {
            if (app.isRepeat) {
                audio.play();
            } else {
                nextBtn.click();
            }
        };
        //Khi bật/tắt random song
        randomBtn.onclick = function () {
            app.isRandom = !app.isRandom;
            randomBtn.classList.toggle('active', app.isRandom);
        };
        //Khi tiến độ bài hát thay đổi
        audio.ontimeupdate = function () {
            var progressPercent = 0;
            if (audio.duration) {
                progressPercent = Math.floor(audio.currentTime / audio.duration * 100);
            }

            sideBarTime.style.width = `${progressPercent}%`;

        }
        //Xử lí khi tua song
        sideBarTime.onclick = function (e) {
            console.log('time' + e.pageX);

        }
        sideBar.onclick = function (e) {
            const seekProcess = e.pageX - this.offsetLeft;
            let progressPercent = (seekProcess / this.offsetWidth) * 100;
            progressPercent = Math.ceil(progressPercent);
            const seekTime = (progressPercent * audio.duration) / 100;
            audio.currentTime = seekTime;
        }

    },

    loadSong: function () {
        audio.src = this.currentSong.path;
    },

    nextSong: function () {
        this.currentIndex += 1;
        console.log(this.currentIndex);
        console.log(this.listSong.length);

        if (this.currentIndex >= this.listSong.length) {
            this.currentIndex = 0;
        }
        this.loadSong();
    },

    prevSong: function () {
        this.currentIndex--;
        
        console.log(this.listSong.length - 1);

        if (this.currentIndex < 0) {
            this.currentIndex = this.listSong.length - 1;
        }
        console.log(this.currentIndex);
        this.loadSong();
    },

    randomSong: function () {
        let newIndex;
        do {
            newIndex = Math.floor(Math.random() * this.listSong.length);
        } while (newIndex === this.currentIndex)
        this.currentIndex = newIndex;
    
        this.loadSong();
    },

    start: function () {
        this.defineProperties();
        this.handleEvent();
        this.loadSong();
    }

};
app.start();