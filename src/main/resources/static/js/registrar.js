

async function registrarColaborador(){
    let datos = {};
    datos.nombreColab = document.getElementById("txtNombreReg").value;
    datos.apellidoPatColab = document.getElementById("txtApellidoReg").value;
    datos.emailColab = document.getElementById("txtEmailReg").value;
    datos.pwdColab = document.getElementById("txtPasswordReg").value;
    let txtRepetirPassword = document.getElementById("txtRepetirPasswordReg").value;


    if( datos.pwdColab !== txtRepetirPassword){
        alert("Las contraseñas son diferentes");
        return;
    }
    console.log(JSON.stringify(datos))
    const request = await fetch('api/Colaborador', {
            method: 'POST',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(datos)
          }).then(response => {

            alert("Usuario registrado exitosamente");
            //window.location.href = 'index.html';
          }).catch(error => console.log("Error: ", error))
}