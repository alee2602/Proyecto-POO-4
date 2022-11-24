console.log("This is index.js");

// All variables

let upload = document.getElementById('upload');
let outputBx = document.getElementById('outputBx');

// Listen for file upload/change

upload.addEventListener("change", ()=>{
     // Initialize file reader

     let fr = new FileReader();
     fr.readAsText(datosH.txt);
     fr.onload = function() {
          console.log(fr.result);
     };
});