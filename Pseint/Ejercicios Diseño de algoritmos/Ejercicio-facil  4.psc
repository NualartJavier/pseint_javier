Proceso sin_titulo
	gal<-0
	lit<-0
	Repetir
		Escribir "Ingrese cantidad a hechar en pesos";
		Leer cant;
		litros<-(cant/820);
		litrosT<-(litros+lit);
		gal<- (litrosT/3785);
		Escribir "Usted lleno ",litros," Litros";
		Escribir "Si desea imprimir el inventario del día, oprimir (1)";
		Leer op;
	Hasta Que (op==1); 
	Escribir "Cantidad de gasolina vendida en galón: ",gal;
FinProceso
