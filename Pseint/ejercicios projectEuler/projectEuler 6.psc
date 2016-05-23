Proceso sin_titulo
	cont1<-0;
	cont2<-0;
	suma_cua<-0;
	suma<-0;
	Mientras cont1<100 Hacer
		cont1<-cont1+1;
		suma_cua<-(cont1^2)+suma_cua;
	FinMientras
	Mientras cont2<100 Hacer
		cont2<-cont2+1;
		suma<-cont2+suma;
	FinMientras
	cua<-suma^2;
	resta<-(suma_cua-cua);
	Escribir "La diferencia es: ",resta;
FinProceso
