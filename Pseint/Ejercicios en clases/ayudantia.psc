Proceso sin_titulo
	suc1_falla1<-0;
	suc1_falla2<-0;
	suc1_falla3<-0;
	suc2_falla1<-0;
	suc2_falla2<-0;
	suc2_falla3<-0;
	suc3_falla1<-0;
	suc3_falla2<-0;
	suc3_falla3<-0;
	sucursal1<-0;
	cant_error<-1;
	sucursal2<-0;
	sucursal3<-0;
	Repetir
		Escribir "Ingrese la sucursal (1)(2)(3)";
		Leer sucur;
		Escribir "Ingrese el tipo de falla (1)leve(2)grave(3)mayor";
		Leer falla;
		Segun falla Hacer
			1:
				costo<-1200;
			2:
				costo<-5000;
			3:
				costo<-15000;
		FinSegun
		Segun sucur Hacer
			1:
				si(costo==1200)entonces
					suc1_falla1<-suc1_falla1+1;
				Sino
					si(costo==5000)entonces
						suc1_falla2<-suc1_falla2+1;
					Sino
						suc1_falla3<-suc1_falla3+1;
					FinSi
				FinSi
				sucursal1<-sucursal1+1;
				costoT1<-costoT1+costo;
			2:
				si(costo==1200)entonces
					suc2_falla1<-suc2_falla1+1;
				Sino
					si(costo==5000)entonces
						suc2_falla2<-suc2_falla2+1;
					Sino
						suc2_falla3<-suc2_falla3+1;
					FinSi
				FinSi
				sucursal2<-sucursal2+1;
				costoT2<-costoT2+costo;
			3:
				si(costo==1200)entonces
					suc3_falla1<-suc3_falla1+1;
				Sino
					si(costo==5000)entonces
						suc3_falla2<-suc3_falla2+1;
					Sino
						suc3_falla3<-suc3_falla3+1;
					FinSi
				FinSi
				sucursal3<-sucursal3+1;
				costoT3<-costoT3+costo;
		FinSegun
		costoT<-costoT1+costoT2+costoT3;
		Escribir "Desea realizar otra incidencia";
		Leer op;
		si(op==1)Entonces
			cant_error<-cant_error+1;
		FinSi
	Hasta Que (op==2)
	Escribir "Recuento total";
	Escribir "----------------------";
	Escribir "Numero total de incidencias: ",cant_error;
	Escribir "Numero total de incidencias por sucursal";
	Escribir "Sucursal 1: ",sucursal1;
	Escribir "Sucursal 2: ",sucursal2;
	Escribir "Sucursal 3: ",sucursal3;
	si(sucursal1>sucursal2 y sucursal1>sucursal3)Entonces
		Escribir "La sucursal 1 es la que presenta mayor cantidad de fallas ";
	Sino
		si(sucursal2>sucursal3 y sucursal2>sucursal1)entonces
			Escribir "La sucursal 2 es la que presenta mayor cantidad de fallas ";
		sino
			Escribir "La sucursal 3 es la que presenta mayor cantidad de fallas ";
		FinSi
	FinSi
	Escribir "Costo total: ",costoT;
	
FinProceso
