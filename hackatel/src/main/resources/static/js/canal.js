// AJAX EL MEJOR
// https://code-boxx.com/post-get-javascript-without-html-form/

// (A) POST WITH AJAX
function ajaxPOST (idcanal) {
    // (A1) DATA
    var data = new FormData();
    data.append("idcanal", idcanal);

    // (A2) AJAX
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/actualizarcanal");
    xhr.onload = function(){
        console.log(this.response);
    };
    xhr.send(data);

    switch (parseInt(idcanal)) {
        case 1:
            navegacion("https://www.facebook.com/OsiptelOficial");
            break;
        case 2:
            navegacion("https://www.instagram.com/osipteloficial");
            break;
        case 3:
            // navegacion("");
            break;
        case 4:
            navegacion("https://twitter.com/OSIPTEL");
            break;
        case 5:
            // navegacion("");
            break;
        case 6:
            // navegacion("");
            break;
        case 7:
            navegacion("https://vm.tiktok.com/ZMeyB57v6/");
            break;
        case 8:
            navegacion("https://www.linkedin.com/company/osiptel");
            break;
        case 9:
            navegacion("https://www.youtube.com/user/OsiptelOficial");
            break;
        case 10:
            navegacion("");
            break;
        case 11:
            navegacion("https://open.spotify.com/show/2RpK5uIOVDby01ulbTh3RQ?si=2G1YcLJvSEeH28hyFWWuVA&dl_branch=1");
            break;
        case 12:
            navegacion("");
            break;
        case 13:
            navegacion("mailto:usuarios@osiptel.gob.pe");
            break;
        default:
            break;
    }
}

function navegacion(canal){
let url = canal;
let ventana;
console.log(url);
ventana=window.open(
    url,
    "_blank" // <- This is what makes it open in a new window.
    ,""  );
}

