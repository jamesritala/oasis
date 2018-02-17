// The root URL for the RESTful services

var rootURL = "http://localhost:8080/OasisWeb/rest/apply/";

var currentApplication;

$('#btnAdd').click(function() {

                addApplication();

                return false;

});


function findByName(searchKey) {

                console.log('findByReference: ' + searchKey);

                $.ajax({

                                type: 'PUT',

                                url: rootURL + '/search/' + searchKey,

                                dataType: "json",

                                success: renderList

                });

}

 
function addApplication() {

                console.log('addApplication');

                $.ajax({

                                type: 'PUT',

                                contentType: 'application/json',

                                url: rootURL,

                                dataType: "json",

                                data: formToJSON(),

                                success:  function(resultData){
                                        var res= document.getElementById("ref");
                                        res.innerHTML=resultData.refNum;
                                }

                });

}

// Helper function to serialize all the form fields into a JSON string

function formToJSON() {

                var ApplicationId = $('#ApplicationId').val();

                return JSON.stringify({
                                "firstName": $('#firstName').val(),
                                "lastName": $('#lastName').val(),
                                "id": $('#said').val(),
                                "gender": $('#gender').val(),
                                "dateOfBirth": $('#dateOfBirth').val(),
                                "maritalStatus": $('#maritalStatus').val(),
                                "cellNumber": $('#cellNumber').val(),
                                "email": $('#email').val(),
                                "occupation": $('#occupation').val(),
                                "companyName": $('#companyName').val(),
                                "monthlyIncome": $('#monthlyIncome').val(),
                                "employmentPeriod": $('#employmentPeriod').val(),
                                "workPhone": $('#workPhone').val(),
                                "incomeTaxNumber": $('#incomeTaxNumber').val(),
                                "methodOfContact": $('#methodOfContact').val(),
                                "typeOfPlace": $('#typeOfPlace').val() ,
                                "lengthOfStay": $('#lengthOfStay').val()

                                });

}

