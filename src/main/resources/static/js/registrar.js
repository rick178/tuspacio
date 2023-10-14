

async function registrarUsuario(){
    let datos = {};
    datos.nombre = document.getElementById("txtNombreReg").value;
    datos.apellido = document.getElementById("txtApellidoReg").value;
    datos.email = document.getElementById("txtEmailReg").value;
    datos.password = document.getElementById("txtPasswordReg").value;
    let txtRepetirPassword = document.getElementById("txtRepetirPasswordReg")

    if(datos.password !== txtPasswordReg){
        alert("Las contraseñas son diferentes");
        return;
    }


}