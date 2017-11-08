/* 
 * Licencia pendiente, para cambiar la licencia ir a -> Tools | Templates
 */
var loader = $("#loader-holder");

$(document).ajaxStart(function () {
    $("body").css("overflow","hidden");
    $( loader ).show();
}).ajaxStop(function () {
        $("body").css("overflow","auto");
        $( loader ).hide();
});
    
function registro() { 
    $.post(
            "registro",
            $("#formulario").serialize(),            
            function(response) {
                console.log(response);
                if(response.registrado===true) {
                    $("#modalExito").modal("show");
                } else {
                    $("#modalFallo").modal("show");
                }
            });
}