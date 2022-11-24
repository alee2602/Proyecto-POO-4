var descripcionH = new Array();
var archivoH = XMLHttpRequest();
var datosH = "datosH.txt";

archivoH.open("GET", datosH, false);
archivoH.send(null);
var txt = archivoH.responseText;

for(var i = 0;i<txt.length; i++){
     descripcionH.push(txt[i]);
}
descripcionH.forEach(function(data){
     console.log(data);
});