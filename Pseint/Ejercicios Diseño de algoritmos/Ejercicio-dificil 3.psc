Proceso sin_titulo
	Escribir "Ingrese los puntos (X0,y0)";
	Leer x0,y0;
	Escribir "Ingrese los puntos (X1,Y1)";
	Leer x1,y1;
	m<-((y1-y0)/(x1-x0));
	x0<- (m*x0);
	si (x0>0) Entonces
		si(x0>y0)Entonces
			Escribir "La ecuacion general es: ";
			Escribir m,"x-y-",y0-x0,"=0";
		Sino
			Escribir "La ecuacion general es: ";
			Escribir m,"x-y+",y0-x0,"=0";
		FinSi
		
	Sino
		si(x0<y0)Entonces
			Escribir "La ecuacion general es: ";
			Escribir m,"x-y",y0-x0,"=0";
		FinSi
	FinSi
	//incompleto
FinProceso
