async function editTable

let config = {
    method:"GET", // method is a reference to the kind of request you are making (the verb): GET is the default
    headers:{'Content-Type':"application/json"}, // some APIs will return an error message without this value included
    
}


 let httpResponse = await fetch("https://localhost8080/requests", config); // notice we added the config object
 console.log(httpResponse);

 if(httpResponse.status === 200){ // 200 basically means request made successfully
    
    let responseBody = await httpResponse.json(); // remember, json() returns a promise, so we use await to get the data we want out of it
    console.log(responseBody)
    for (let requests of responseBody){
        console.log(requests.assignedTo)
    }
    console.log(localStorage.getItem("requests"));
        let defectBody = document.getElementById("defectBody");
        
        htmlString = "";

        for(defect of responseBody) {
            if(defect.assignedTo == localStorage.getItem("username")) {
                htmlString += "<tr>" 

                htmlString += "<td>"  + defect.defectId + "</td>"       
                htmlString += "<td>"  + defect.status + "</td>"      

                htmlString += "</tr>"    
            }
        }


        defectBody.innerHTML = htmlString;
        
    }      
