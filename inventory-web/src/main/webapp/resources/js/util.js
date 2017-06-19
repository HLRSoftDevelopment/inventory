var mensajeConfirmarBorrado = "Esta seguro que desea eliminar el registro seleccionado?";

function verificarAgregadoRechazado(obj) {
	var objChecked = obj.checked;
	if (objChecked) {
		var objId = obj.id;
		if (objId.indexOf('aceptado') > 0) {
			objId = objId.replace('aceptado', 'rechazado');
		} else if (objId.indexOf('rechazado') > 0) {
			objId = objId.replace('rechazado', 'aceptado');
		}

		var nObj = document.getElementById(objId);
		if (nObj) {
			if (nObj.checked) {
				nObj.checked = false;
			}
		}
	}
} 
function abrirPopup(url) {
	opciones = "left=0, top=0, screenX=0, screenY=100, width=950, height=500, "
			+ "copyhistory=no, directories=no, resizable=no, titlebar=no, "
			+ "toolbar=no, scrollbars=yes, location=0, menubar=0, dependent=yes";
	window.open(url, "", opciones);
}

function verificarSecretariaDireccion(obj) {
	var objChecked = obj.checked;
	if (objChecked) {
		var objId = obj.id;
		if (objId.indexOf('aSecretaria') > 0) {
			objId = objId.replace('aSecretaria', 'aDireccion');
		} else if (objId.indexOf('aDireccion') > 0) {
			objId = objId.replace('aDireccion', 'aSecretaria');
		}

		var nObj = document.getElementById(objId);
		if (nObj) {
			if (nObj.checked) {
				nObj.checked = false;
			}
		}
	}
}

function verificarFirmadoDevuelto(obj) {
	var objChecked = obj.checked;
	if (objChecked) {
		var objId = obj.id;
		if (objId.indexOf('firmado') > 0) {
			objId = objId.replace('firmado', 'devuelto');
		} else if (objId.indexOf('devuelto') > 0) {
			objId = objId.replace('devuelto', 'firmado');
		}

		var nObj = document.getElementById(objId);
		if (nObj) {
			if (nObj.checked) {
				nObj.checked = false;
			}
		}
	}
}

function TrimString(sInString) {
	sInString = sInString.replace(/^\s+/g, "");
	return sInString.replace(/\s+$/g, "");
}

function openReportWindow(url) {
	var reportWindow = window.open(url, "reportWindow",
			"menubar=0,resizable=0,status=0,width=640,height=480");
}

function toggleCheckAll(formName, controlName, value, exclude) {
	var formObject = document.getElementById(formName);
	if (formObject) {
		var elements = formObject.elements;
		for (i = 0; i < elements.length; i++) {
			var element = elements[i];
			if (element.type == 'checkbox') {
				if (element.id != null && element.id.indexOf(controlName) != -1) {
					element.checked = value;
				} else if (exclude) {
					element.checked = false;
				}
			}
		}
	}
}

function setFocus(componentName) {
	var component = document.getElementById(componentName);
	if (component) {
		component.focus();
	}
}

function esIE() {
	if (document.all) {
		return true;
	}
	return false;
}

function aceptarNumerosLetras(evt) {
	var key = null;
	if (esIE()) {
		key = evt.keyCode;
	} else {
		key = evt.which;
	}
	return (key == 95 || (key >= 48 && key <= 57) || (key >= 64 && key <= 90) || (key >= 97 && key <= 121));
}

function aceptarNumeros(evt) {
	var key = null;
	if (esIE()) {
		key = evt.keyCode;
	} else {
		key = evt.which;
	}
	return (key == 95 || (key >= 48 && key <= 57));
}


function popUp(url, alto, ancho) {
	var left   = (screen.width  - ancho)/2;
	 var top    = (screen.height - alto)/2;
	 var params = 'width='+ancho+', height='+alto;
	 params += ', top='+top+', left='+left;
	 params += ', directories=no';
	 params += ', location=no';
	 params += ', menubar=no';
	 params += ', resizable=no';
	 params += ', scrollbars=yes';
	 params += ', status=no';
	 params += ', toolbar=no';
	 newwin=window.open(url,'SRI', params);
	 if (window.focus) {newwin.focus()}
	 return false;
}

function updateParentWindow(nombreForm,nombreBotonRenderizado) {
	var elementToGet = nombreForm + ":" + nombreBotonRenderizado;
	var bt= opener.document.forms[nombreForm].elements[elementToGet]
	bt.click();
	window.close();
}

function setValueAll(formName, controlName, value, type, exclude) {
	var formObject = document.getElementById(formName);
	if (formObject) {
		var elements = formObject.elements;
		for (i=0; i < elements.length; i++) {
			var element = elements[i];
			if (element.id != null && element.id.indexOf(controlName) != -1) {
				if (element.type == 'checkbox') {
					element.checked = value;
				} else {
					element.value = value;
				}
			}
		}
	}
}




function ismaxlength(obj, MaxLen){
	if (obj.value.length>MaxLen){
	obj.value=obj.value.substring(0,MaxLen);
	}
}

