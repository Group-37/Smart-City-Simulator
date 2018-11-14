function continueSC()
{
	var filePath = document.getElementById("filePath");
	console.log(filePath.value);
	$.ajax({
		type: "POST",
		url: "/SmartCitySimulator/continue",
		data: filePath.value + "," + "SCFile",
		success: function(msg){
			//alert('wow'+msg);
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
			//alert('wow'+msg);
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
			//alert('wow'+msg);
		}
	});
}