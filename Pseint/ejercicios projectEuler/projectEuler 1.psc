Proceso sin_titulo
	cont<-0;
	sumaT<-0;
	Repetir
		cont<-cont+1;
		mult3<-cont%3;
		mult5<-cont%5;
		si(mult3==0)Entonces
			sumaT<-sumaT+cont;
			Escribir "el multiplo es ",cont;
		Sino
			si(mult5==0)Entonces
				sumaT<-sumaT+cont;
				Escribir "El multiplo es ",cont;
			FinSi
		FinSi
	Hasta Que (cont==999)
	Escribir "La suma total de los multiplos es ",sumaT;
FinProceso
