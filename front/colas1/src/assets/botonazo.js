(function($) {
    $.isBlank = function(obj) {
        return (!obj || $.trim(obj) === "");
    };

    $.getUrlParameter = function getUrlParameter(sParam) {
        var sPageURL = window.location.search.substring(1),
            sURLVariables = sPageURL.split('&'),
            sParameterName,
            i;

        for (i = 0; i < sURLVariables.length; i++) {
            sParameterName = sURLVariables[i].split('=');

            if (sParameterName[0] === sParam) {
                return sParameterName[1] === undefined ? true : decodeURIComponent(sParameterName[1]);
            }
        }
    };
})(jQuery);
$(document).ready(function() {

    var ruta1 = "http://localhost:9093/users/";

    $("#correo").val("");
    $("#nombre").val("");

    var validateUserForm = function(new_user) {
        var valid = true;
        if ($.isBlank(new_user.name)) {
            valid = false;
            alert("Name is mandatory");
        } else {}
        if ($.isBlank(new_user.email)) {
            valid = false;
            alert("Email is mandatory");
        } else {

        }


        return valid;
    }



    $('#botonazo').on('click', function(e) {
        event.preventDefault();

        var aux = $("#check").is(':checked');

        var new_user = {
            name: $("#nombre").val() || '',
            email: $("#correo").val() || '',
            enviartarjeta: aux
        }

        if (validateUserForm(new_user)) {

            $.ajax({
                url: ruta1,
                method: "POST",
                contentType: "application/json; charset=UTF-8",
                dataType: "json",
                data: JSON.stringify(new_user),
                success: function(result) {
                    window.location.href = "/";
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    console.log(jqXHR);
                }

            });
        }
        console.log(new_user);
    });


});