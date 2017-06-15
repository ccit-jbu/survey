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

