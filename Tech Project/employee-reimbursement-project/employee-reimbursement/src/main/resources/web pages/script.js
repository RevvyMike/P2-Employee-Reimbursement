var table = document.getElementById("table"),rIndex;

for(var i= 1; i< table.rows.length; i++){
    table.rows[i].onclick = function(){
        rIndex = this.rowIndex;
        console.log(rIndex);

        document.getElementById("fname").value = this.cells[1].innerHTML;
        document.getElementById("request").value = this.cells[2].innerHTML;
        document.getElementById("description").value = this.cells[3].innerHTML;
    };
}

function editRow(){
    table.rows[rIndex].cells[1].innerHTML = document.getElementById("fname").value;
    table.rows[rIndex].cells[2].innerHTML = document.getElementById("request").value;
    table.rows[rIndex].cells[3].innerHTML = document.getElementById("description").value;
}

function editTableDisplay(){
    document.querySelector('.editTable').setAttribute('style', 'display: block');
}