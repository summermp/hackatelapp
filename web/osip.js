let navbar = document.querySelectorAll('.nav-li');
let canal = document.querySelectorAll('.canal');

let btndaltonico = document.querySelector('#btndaltonico');

let social = document.querySelector('#canal-3');

let redsocial=document.querySelector('#redsocial');

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

window.onload = function() {
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
                    audio('Servicio');
                    break;
                case 2:
                    // console.log('#',li[i].innerHTML);
                    audio('Consulta');
                    break;
                case 3:
                    // console.log('#',li[i].innerHTML);
                    audio('Formulario');
                    break;
                case 4:
                    // console.log('#',li[i].innerHTML);
                    audio('Ayuda');
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
                    audio('Revisa inmediatamente la sección de preguntas frecuentes');
                    break;
                case 1:
                    audio('Redes sociales');
                    tiempoespera('Tiempo de respuesta 6 minutos');
                    break;
                case 2:
                    audio('Llamadas');
                    tiempoespera('Tiempo de respuesta 5 minutos');
                    break;
                default:
                    break;
            }
        }, false);
    }

}


// Get the modals
var modal = document.getElementById("myModal");

// Get the button that opens the modal
var btn = document.querySelector("#abrirModal");
// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];
// When the user clicks on the button, open the modal
btn.onclick = function() {
  modal.style.display = "block";
}
// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}
// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}





let estado = "off";
btndaltonico.addEventListener('click', function (e) {
    if (estado == "off") {
        cambiarcolor('white');
        estado = "on";
        console.log('white');
        audio('desactivado para daltonicos');
    } else {
        cambiarcolor('black');
        estado = "off";
        console.log('black');
        iterartags(obtenertags('li'));
        estilotag(obtenertag('.fa-user-headset'));
        estilotag(obtenertag('.fa-tiktok'));
        audio('activado para daltonicos');
    }
});

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
        console.log('activo');
    }
});

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