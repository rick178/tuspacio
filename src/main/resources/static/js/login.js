

async function login(){
    let datos = {};
    datos.emailColab = document.getElementById("txtEmailLogin").value;
    datos.pwdColab = document.getElementById("txtPasswordLogin").value;

    console.log(JSON.stringify(datos))
    const request = await fetch('api/login', {
            method: 'POST',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(datos)
          }).then(response => {

            //alert("Usuario registrado exitosamente");
            //window.location.href = 'index.html';
          }).catch(error => console.log("Error: ", error))
}

