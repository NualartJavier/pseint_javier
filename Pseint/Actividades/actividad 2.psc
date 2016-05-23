Proceso sin_titulo
	cont1<-0;
	estIn<-0;
	estSu<-0;
	estBu<-0;
	maxPromEst<-0;
	minPromEst<-1000;
	numEst2<-0;
	Repetir
	 Escribir "Ingrese la cantidad de establecimientos";
	 Leer cantEst;
	 si(cantEst<=0)entonces
		 escribir "ERROR en la cantidad ingresada, intentelo otra vez";
	 FinSi
 Hasta Que (cantEst>0)
	Mientras (cantEst>cont1) Hacer
		cont1<-cont1+1;
		puntB<-0;
		puntN<-0;
		puntA<-0;
		cont2<-0;
		Escribir "Establecimiento n°",cont1;
		Repetir
			Escribir "Ingrese la cantidad de estudiantes";
			Leer cantAl;
			si(cantAl<=0)entonces
				escribir "ERROR en la cantidad ingresada, intentelo otra vez";
			FinSi
	 Hasta Que (cantAl>0)
		Repetir
			sumPunt<-0;
			cont2<-cont2+1;
			Repetir
			  Escribir "Ingrese el puntaje del estudiante n°",cont2," (Max 600pts)";
			  Leer punt;
			  si(punt<=0 || punt>600)entonces
				  escribir "ERROR en el puntaje ingresade, intentelo otra vez";
			  FinSi
		 Hasta Que (punt>0 y punt<600)
			sumPunt<-sumPunt+punt;
			si (punt<300) Entonces
				puntB<-puntB+1;
			Sino
				si (punt>=500)Entonces
					puntA<-puntA+1;
			    Sino
					puntN<-puntN+1;
				FinSi
			FinSi
		Hasta Que (cont2==cantAl)
		porcB<-(puntB*100)/cantAl;
		si(porcB>=70)Entonces
			//calificacion del colegio INSUFICIENTE
			Escribir "La calificacion del establecimiento es INSUFICIENTE";
			estIn<-estIn+1;
		Sino
			porcA<-(puntA*100)/cantAl;
			si(porcA>70)entonces
				//calificacion del colegio BUENO
				Escribir "La calificacion del establecimiento es BUENO";
				estBu<-estBu+1;
			Sino
				//calificacion del colegio SUFICIENTE
				Escribir "La calificacion del establecimiento es SUFICIENTE";
				estSu<-estSu+1;
			FinSi
		FinSi
		promEst<-(sumPunt/cantAl);
		si(promEst>maxPromEst)entonces
			maxPromEst<-promEst;
			numEst<-cont1;
		FinSi
		si(promEst<minPromEst)Entonces
			minPromEst<-promEst;
			numEst2<-cont1;
		FinSi
	FinMientras
	Escribir "-----------------------------";
	Escribir "Resultados generales";
	Escribir "Cantidad de establecimientos con calificacion INSUFICIENTE: ",estIn;
	Escribir "Cantidad de establecimientos con calificacion SUFICIENTE: ",estSu;
	Escribir "Cantidad de establecimientos con calificacion BUENO: ",estBu;
	Escribir "El que obtuvo mejor promedio de puntajes fue el establecimiento n°: ",numEst;
	Escribir "El que obtuvo peor promedio de puntajes fue el establecimiento n°: ",numEst2;
FinProceso
