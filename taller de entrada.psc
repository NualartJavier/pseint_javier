Proceso sin_titulo
	max_At<-0;
	rango_des1<-0;
	rango_des2<-0;
	rango_des3<-0;
	max_sobre<-0;
	contCent<-0;
	kid_desnu<-0;
	kid_bien<-0;
	kid_sobre<-0;
	Repetir
	   Escribir "Ingrese la cantidad de centros asistenciales";
	   Leer cant_centro;
	   si(cant_centro<0)entonces
		   Escribir "Cantidad ingresada incorrecta, intene otra vez";
	   FinSi
 Hasta Que (cant_centro>0) 
	Repetir
		contKid<-0;
		kidsobre<-0;
		contCent<-contCent+1;
		Escribir "Centro asistencial N°",contCent;
		Escribir "Ingrese la cantidad de atenciones";
		Leer cant_At;
		Repetir
			contKid<-contKid+1;
			Escribir "Niño N°",contKid;
			Repetir
				Escribir "Ingrese la edad del niño (entre 1-9 años)";
				Leer edad;
				si(edad>9 y edad<1)entonces
					Escribir "Cantidad ingresada incorrecta, intene otra vez";
				FinSi
			Hasta Que (edad<10 y edad>0)	
			Repetir
				Escribir "Ingrese el peso del niño";
			    Leer peso;
				si(peso<0)entonces
					Escribir "Cantidad ingresada incorrecta, intene otra vez";
				FinSi
			Hasta Que (peso>0)	
			rango1<-(3*edad+7)+4;
			rango2<-(3*edad+7)-4;
			si(peso<rango1 y peso>rango2)entonces
				Escribir "Niño bien nutrido";
				kid_bien<-kid_bien+1;
			Sino
				si(peso<rango2)entonces
					Escribir "Niño desnutrido";
					kid_desnu<-kid_desnu+1;
					si(edad<4)entonces
						rango_des1<-rango_des1+1;
					Sino
						si(edad>=4 y edad<7)Entonces
							rango_des2<-rango_des2+1;
						Sino
							rango_des3<-rango_des3+1;
						FinSi
					FinSi
				Sino
					Escribir "Niño en sobrepeso";
					kid_sobre<-kid_sobre+1;
					kidsobre<-kidsobre+1;
				FinSi
			FinSi
		Hasta Que (contKid==cant_At)
		si(kidsobre>max_sobre)entonces
			max_sobre<-kidsobre;
			centro_sobre<-contCent;
		FinSi
		si(cant_At>max_At)Entonces
			max_At<-cant_At;
			centro_max<-contCent;
		FinSi
	Hasta Que (contCent==cant_centro)
	Escribir "-----------------";
    Escribir "recuento total";
	Escribir "-----------------";
	Escribir "total de niños desnutridos: ",kid_desnu;
	Escribir "total de niños bien nutridos: ",kid_bien;
	Escribir "total de niños con sobrepeso: ",kid_sobre;
	Escribir "Centro asistencial con mas atenciones: ",centro_max;
	Escribir "Centro asistencial donde se regristra mayor cantidad de sobrepeso: ",centro_sobre;
	si(rango_des1>rango_des2 y rango_des1>rango_des3)entonces
		Escribir "El rango de edad donde se encuentra la mayor cantidad de desnutridos es (1-3)años";
	Sino
		si(rango_des2>rango_des3)entonces
			Escribir "El rango de edad donde se encuentra la mayor cantidad de desnutridos es (4-6)años";
		Sino
			Escribir "El rango de edad donde se encuentra la mayor cantidad de desnutridos es (7-9)años";
		FinSi
	FinSi
	
FinProceso
