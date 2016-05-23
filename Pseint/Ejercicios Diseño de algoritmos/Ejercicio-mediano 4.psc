Proceso sin_titulo
	Escribir "Ingrese los parametros (Ancho y Alto del rectangulo)";
	Leer h,b;
	//Area del rectangulo
	aRec<- (b*h)
	//area del circulo, considerando b como radio
	aCir<- (PI*b^2)
	//diferencia de areas
	areaT<-(aRec-aCir);
	Escribir "La diferencia entre el Area del rectangulo y circulo es: ",areaT;
FinProceso
