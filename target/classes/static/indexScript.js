function continueSC()
{
	var filePath = document.getElementById("filePath");
	console.log(filePath.value);
	$.ajax({
		type: "POST",
		url: "/SmartCitySimulator/continue",
		data: filePath.value + "," + "SCFile",
		success: function(msg){
			alert('wow'+msg);
			var text = document.getElementsById("resultText");
			console.log(msg);
			text.innerHTML += msg;
		}
	});
}

function continueCS()
{
	var filePath = document.getElementById("filePath");
	console.log(filePath.value);
	$.ajax({
		type: "POST",
		url: "/SmartCitySimulator/continue",
		data: filePath.value + "," + "CSFile",
		success: function(msg){
			alert('wow'+msg);
			var text = document.getElementsById("resultText");
			console.log(msg);
			text.innerHTML += msg;
		}
	});
}

function continueTD()
{
	var filePath = document.getElementById("filePath");
	console.log(filePath.value);
	$.ajax({
		type: "POST",
		url: "/SmartCitySimulator/continue",
		data: filePath.value + "," + "TDFile",
		success: function(msg){
			alert('wow'+msg);
			var text = document.getElementsById("resultText");
			console.log(msg);
			text.innerHTML += msg;
		}
	});
}

function testAdd()
{
	console.log("This!");
}

function connect() {
	console.log("Gets in here!");
    var socket = new SockJS('/gs-guide-websocket');
    var stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
    	console.log("Connected!")
        setConnected(true);
        stompClient.subscribe('/topic/results', function (message) {
            console.log("message"+message);
            var text = document.getElementsById("resultText");
            text.innerHTML += msg;
        });
    });
}