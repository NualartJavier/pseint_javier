Proceso sin_titulo
	cont<-0;
	primN<-0;
	Mientras (primN < 10001) Hacer
		cont<-cont+1;
		si (cont%2 = 0 y cont<>2 o cont <= 1 o cont%3 = 0 y cont<>3 o cont%5 = 0 y cont<>5)Entonces
			par<-1;
		Sino
			primN<-primN+1;
			prim<-cont;
		FinSi
	FinMientras
	Escribir "El numero primo en la 10001st posicion es: ",prim;
FinProceso
