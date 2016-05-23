Proceso sin_titulo
	cont<-0;
	suma<-0;
	Mientras (cont<2000000) Hacer
		cont<-cont+1;
		Si cont%2 = 0 y cont<>2 o cont <= 1 o cont%3 = 0 y cont<>3 o cont%5 = 0 y cont<>5 Entonces
			par<-2;
		Sino
			suma<-suma+cont;
		FinSi
	FinMientras
	Escribir "La suma de los numero primos es ",suma;
FinProceso
