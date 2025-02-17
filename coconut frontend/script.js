
window.onload=function()
{
    showPeoples();
    showMarkets();
   
}
function showMarkets()
{
    fetch("http://localhost:8080/coconut/markets").then((response)=>response.json()).
    then((markets)=>{
        const table=document.getElementById("markets");
        markets.forEach(element => {
            var row=`<tr>
                <td>${element.id}</td>
                 <td>${element.marketExchange}</td>
                  <td>${element.district}</td>
                   <td>${element.phoneNumber}</td>
                </tr>`
            table.innerHTML+=row;
        });

    })
}

function showPeoples()
{
    fetch("http://localhost:8080/coconut/peoples").
    then((response)=>response.json()).
    then((peoples)=>{
        const table=document.getElementById("getpeoples")
        peoples.forEach(element => {
            var row=`<tr>
                <td>${element.userName}</td>
                <td>${element.emailId}</td>
                <td>${element.district}</td>
                </tr>`
                table.innerHTML+=row;
            
        });
    })
}
