var xmlhttp = new XMLHttpRequest();
xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
        data = xmlhttp.responseText;
        myObj = JSON.parse(data);
        demo = document.getElementById("demo");
        demo.innerHTML = myObj.name;
    }
};
xmlhttp.open("GET", "1.json", true);
xmlhttp.send();