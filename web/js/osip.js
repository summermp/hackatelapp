let navbar = document.querySelectorAll('.nav-li');
let canal = document.querySelectorAll('.canal');

let grayscale = document.querySelectorAll('.grayscale');

let btndaltonico = document.querySelector('#btndaltonico');
// let icoacesibilidad = document.querySelector('#icoacesibilidad');

let social = document.querySelector('#canal-3');
let canal2 = document.querySelector('#canal-2');

let redsocial=document.querySelector('#redsocial');
let emailul=document.querySelector('#email-ul');

function textToSpeach(message) {
    const speach = new SpeechSynthesisUtterance(message);
    [speach.voice] = speechSynthesis.getVoices();
    speechSynthesis.speak(speach);
}

function audio(msg) {
    if (responsiveVoice.voiceSupport()) {
        responsiveVoice.setDefaultVoice("Spanish Female");
        responsiveVoice.speak(msg);
    }
}

function audiotiempo(msg) {
    if (responsiveVoice.voiceSupport()) {
        responsiveVoice.setDefaultVoice("Spanish Latin American Female");
        responsiveVoice.speak(msg);
    }
}
function tiempoespera(msg) {
    setTimeout(() => {
        audiotiempo(msg);
    }, 1500)
}

function cancelaraudio() {
    // responsiveVoice.cancel(); 
    // window.location.reload(true);
    responsiveVoice.enableWindowClickHook();
    // window.location = window.location.href+'?eraseCache=true';
    // window.history.forward(1);
}

let iaudio = 1;
function cambiarAudio(x) {
    if (uno == '1') {
        x.classList.toggle("fa-volume-mute");
        x.classList.remove("fa-volume-up");
        uno = '0';
    } else {
        x.classList.toggle("fa-volume-up");
        x.classList.remove("fa-volume-mute");
        uno = '1';
    }
}



window.onload = function () {
    
    for (let i = 0; i < navbar.length; i++) {
        // console.log(li[i].innerHTML);
        navbar[i].addEventListener('mouseover', function (e) {
            switch (i) {
                case 0:
                    // console.log('#', li[i].innerHTML);
                    audio('Logo osiptel');
                    break;
                case 1:
                    // console.log('#',li[i].innerHTML);
                    audio('Te orientamos');
                    break;
                case 2:
                    // console.log('#',li[i].innerHTML);
                    audio('Tus derechos');
                    break;
                case 3:
                    // console.log('#',li[i].innerHTML);
                    audio('Preguntas frecuentes');
                    break;
                case 4:
                    // console.log('#',li[i].innerHTML);
                    audio('Canales de atención');
                    break;
                default:
                    break;
            }
        }, false);
    }

     for (let i = 0; i < canal.length; i++) {
        // console.log(li[i].innerHTML);
        canal[i].addEventListener('mouseover', function (e) {
            switch (i) {
                case 0:
                    audio('Realizar una solicitud');
                    tiempoespera('Tiempo de respuesta 10 minutos');
                    break;
                case 1:
                    audio('Enviar correo');
                    tiempoespera('Tiempo de respuesta 15 minutos');
                    break;
                case 2:
                    audio('Redes sociales');
                    tiempoespera('Tiempo de respuesta 2 minutos');
                    break;
                case 3:
                    audio('Llamadas telefónicas');
                    tiempoespera('Tiempo de atención 5 minutos');
                    break;
                case 4:
                    audio('Presencial');
                    tiempoespera('Tiempo de atención 15 minutos');
                    break;
                
                
                default:
                    break;
            }
        }, false);
    }

    modal4.style.display = "block";
}


// Get the modals
var modal = document.getElementById("myModal");
var modal2 = document.getElementById("myModal2");
var modal3 = document.getElementById("myModal3");
var modal4 = document.getElementById("myModal4");

// Get the button that opens the modal
var btn = document.querySelector(".abrirModal1");

var btn2 = document.querySelector(".abrirModal2");
var btn3 = document.querySelector(".abrirModal3");
var btn4 = document.querySelector(".abrirModal4");
// Get the <span> element that closes the modal
var span = document.getElementById("close1");
var span2 = document.getElementById("close2");
var span3 = document.getElementById("close3");
var span4 = document.getElementById("close4");
// When the user clicks on the button, open the modal
var btn = document.querySelectorAll(".abrirModal1");
for (var i = 0; i < btn.length; i++) {
    btn[i].addEventListener("click", () => {
        modal.style.display = "block";      
    });
}

var btn3 = document.querySelectorAll(".abrirModal3");
for (var i = 0; i < btn3.length; i++) {
    btn3[i].addEventListener("click", () => {
        modal3.style.display = "block";      
    });
}

// btn.onclick = function() {
//   modal.style.display = "block";
// }




btn2.onclick = function() {
  modal2.style.display = "block";
}
// When the user clicks on <span> (x), close the modal
btn3.onclick = function() {
  modal3.style.display = "block";
}

// btn4.onclick = function() {
//   modal4.style.display = "block";
// }

span.onclick = function() {
  modal.style.display = "none";
}
span2.onclick = function() {
  modal2.style.display = "none";
}
span3.onclick = function() {
  modal3.style.display = "none";
}
span4.onclick = function() {
  modal4.style.display = "none";
}
// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
  if (event.target == modal2) {
    modal2.style.display = "none";
  }
  if (event.target == modal3) {
    modal3.style.display = "none";
  }
  if (event.target == modal4) {
    modal4.style.display = "none";
  }
}

let estado = "off";
let color = document.querySelector("html");
let findlink = document.getElementsByTagName("link");
btndaltonico.addEventListener('click', function (e) {
    if (estado == "off") {
        cambiarcolor('white');
        estado = "on";
        console.log('white');
        findlink[0].href = "/css/osip.css";
        audio('desactivado para daltonicos');
    } else {
        estado = "off";
        console.log('black');
        findlink[0].href = "/css/daltonico.css";
        audio('activado para daltonicos');
    }
});

let uno = "1";
function cambiarIcono(x) {
    if (uno == '1') {
        x.classList.toggle("fa-times-circle");
        x.classList.remove("fa-universal-access");
        uno = '0';
    } else {
        x.classList.toggle("fa-universal-access");
        x.classList.remove("fa-times-circle");
        uno = '1';
    }
}

let verificar = "0";
redsocial.style.display="none";
social.addEventListener('click', function (e) {
    if (verificar == "0") {
        verificar = "1";
        redsocial.style.display = "none";
        console.log('inactivo');
    } else {
        verificar = "0";
        redsocial.style.display = "block";
        setTimeout(() => {
            redsocial.style.display = "none";
        }, 10000);
        console.log('activo');
    }
});

// let check = "0";
// emailul.style.visibility = "hidden";
// canal2.addEventListener('click', function (e) {
//     if (check == "0") {
//         check = "1";
//         emailul.style.visibility = "hidden";
//         console.log('inactivo');
//     } else {
//         check = "0";
//         emailul.style.visibility = "visible";
//         console.log('activo');
//     }
// });



btndaltonico.addEventListener('mouseover', function (e) {
    setTimeout(() => {
        audio('botón para activar daltonicos');
    }, 100)
    
});

function cambiarcolor(color) {
    document.body.style.background = color;    
}

function iterartags(tags) {
    for (let i = 0; i < tags.length; i++) {
        // console.log(li[i].innerHTML);
        tags[i].style.color = 'white';
        tags[i].style.background = 'black';
    }
}
function obtenertags(tags) {
    let listatags = document.querySelectorAll(tags);
    return listatags;
}

function estilotag(tag) {
    tag.style.color = 'white';
}

function obtenertag(tag) {
    let elemento = document.querySelector(tag);
    return elemento;
}

function cambiarlinkcss(link){
    var findlink = document.getElementsByTagName("link");
    findlink[0].href = link;
}

//Get the button
var mybutton = document.getElementById("buttonscroll");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}
