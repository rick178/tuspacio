

async function registrarColaborador(){
    let datos = {};
    datos.nombre = document.getElementById("txtNombreReg").value;
    datos.apellido = document.getElementById("txtApellidoReg").value;
    datos.email = document.getElementById("txtEmailReg").value;
    datos.password = document.getElementById("txtPasswordReg").value;
    let txtRepetirPassword = document.getElementById("txtRepetirPasswordReg").value;

    if(datos.password !== txtRepetirPassword){
        alert("Las contraseñas son diferentes");
        return;
    }
    const request = await fetch('api/colaborador', {
            method: 'POST',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(datos)
          }).then(response => {
            alert("Usuario registrado exitosamente");
            window.location.href = 'index.html';
          })
}