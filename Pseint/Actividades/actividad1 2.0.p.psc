Proceso sin_titulo
	Repetir
		cont1<-0;
		sumProm<-0;
		repro<-0;
		apro<-0;
		promMax<-0;
		enExa<-0;
		Escribir "Ingrese la cantidad de alumnos";
		Leer cantA;
		Escribir "Ingrese la cantidad de notas por alumno";
		Leer cantN;
		Repetir
			cont2<-0;
			prom<-0;
			notasT<-0;
			Repetir
				Escribir "Ingrese la nota N°",cont2+1," del alumno ",cont1+1;
				Leer nota;
				notasT<-notasT+nota;
				prom<-notasT/cantN;
				cont2<-cont2+1;
			Hasta Que (cont2==cantN)
			si(promMax<prom)entonces
				promMax<-prom;
			FinSi
			si (prom!=3.9) entonces
				si(prom<4)entonces
					repro<-repro+1;
				Sino
					apro<-apro+1;
				FinSi
			Sino
				enExa<-enExa+1;
			FinSi
			sumProm<-sumProm+prom;
			cont1<-cont1+1;
		Hasta Que (cont1==cantA)
		porApro<-(apro*100)/cantA;
		porRepro<-(repro*100)/cantA;
		porenExa<-(enExa*100)/cantA;
		Escribir "El porcentajes del curso ",;
		Escribir "Alumno reprobados ",porRepro,"%";
		Escribir "Alumnos aprobados ",porApro,"%";
		Escribir "Alumnos en examen ",porenExa,"%";
		Escribir "Mejor promedio ",promMax;
		Escribir "El promedio del curso es ",sumProm/cantA;
		Escribir "-----------------------------------------";
		Escribir "Desea calcular nuevo semestre (1)SI(2)NO";
		Leer op;
	Hasta Que (op==2)
	
	

	
FinProceso
