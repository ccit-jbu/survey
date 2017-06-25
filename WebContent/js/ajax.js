/**
 * 
 */

function callAjax(json, href) {
	var jsonStr = encodeURIComponent(JSON.stringify(json))
	           +  "&tm=" + (new Date()).valueOf() + (Math.floor(Math.random() * 1000) + 1);
	
	
	  var xhttp;
	  if (window.XMLHttpRequest) {
	      xhttp = new XMLHttpRequest();
	      } else {
	      // code for IE6, IE5
	      xhttp = new ActiveXObject("Microsoft.XMLHTTP");
	  }

	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	         alert(this.responseText);
	         location.href = href;
	    }
	  };
	  
	  xhttp.open("POST", "callAjax.jbu", true);
	  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
	  xhttp.setRequestHeader("Content-length", jsonStr.length);
	  xhttp.setRequestHeader("Connection", "close");
	  
      xhttp.send("json=" + jsonStr);
}
	
var now = new Date();

Date.prototype.yyyymmdd = function() {
  var mm = this.getMonth() + 1; // getMonth() is zero-based
  var dd = this.getDate();

  return [this.getFullYear(),
              (mm>9 ? '' : '0') + mm,
			  (dd>9 ? '' : '0') + dd
			 ].join('');
};

function val(fieldName, index){
    if (typeof index == "undefined") index = 0;
    return document.getElementsByName(fieldName)[index];
}

function convertArrayToJson(arr, actionName){
	var optionNames = listUpRadioButtn();	
	
	var rsltArr = [];
	obj = {};    
	for (var i=0; i < arr.length;i++){
		
		var key = arr[i].name;
		
		// 옵션 아이템은 만들지 않는다.
		if (key in optionNames) continue;
		
		obj[key] = arr[i].value;
		
		if (key == actionName){
			rsltArr.push(obj);
			obj = {};
		}
		
	}			
	return rsltArr;

}

function listUpRadioButtn(){
	var optionNames = {};
	
	var tags = document.getElementsByTagName("input");
	for (var i = 0; i < tags.length ; i++){
		var tag = tags[i];
		if (tag.type != "radio") continue;
		optionNames[tag.name] = "";
	}
	
	return optionNames;
}

function jsonToForm(jsonObject){
	for (var id in jsonObject){
		if ($("#" + id).length == 0) continue;
		
		var listObject = jsonObject[id];
		var ndx = 0;
		for (var i = 0; i < listObject.length; i++){
			var obj = listObject[i];
			
			for (var fieldId in obj){
				var jQueryElements = $("#" + id + " input[name='" + fieldId + "']");
				if (ndx >= jQueryElements.length) break;
				
				jQueryElements[ndx].value = obj[fieldId];
			}
			ndx++;
		}
	}
}
