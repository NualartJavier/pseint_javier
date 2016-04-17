Proceso sin_titulo
	cont_p<-0;
	puntsT<-0;
	total_goles_f<-0;
	total_goles_c<-0;
	p_ganado<-0;
	p_perdido<-0;
	p_emp<-0;
	Repetir
		Escribir "Partido n°",cont_p+1;
		Escribir "Ingrese la cantidad de goles a favor";
		Leer goles_F;
		Escribir "Ingrese la cantidad de goles en contra";
		Leer goles_C;
		si(goles_F==goles_C)entonces
			escribir "Partido empatado";
			p_emp<-p_emp+1;
			puntsT<-puntsT+1;
		Sino
			si(goles_f>goles_C)entonces
				Escribir "Partido ganado";
				puntsT<-puntsT+3;
				p_ganado<-p_ganado+1;
			Sino
				Escribir "Partido perdido";
				p_perdido<-p_perdido+1;
			FinSi
			
		FinSi
		total_goles_f<-goles_F+total_goles_f;
		total_goles_c<-goles_C+total_goles_c;
		cont_p<-cont_p+1;
	Hasta Que (cont_p==10)
	Escribir "Total de goles a favor: ",total_goles_f;
	Escribir "Total de goles en contra: ",total_goles_c;
	Escribir "Diferencia de goles ",total_goles_f-total_goles_c;
	Escribir "Cantidad de partidos ganados: ",p_ganado;
	Escribir "Cantidad de partidos perdidos: ",p_perdido;
	Escribir "Cantidad de partidos empatados: ",p_emp;
	Escribir "Puntos totales: ",puntsT;
	si (puntsT<10)entonces
		Escribir "Entra a liguilla de promocion";
	Sino
		si(puntsT<=20 y puntsT>=10)entonces
			Escribir "No entra a liguilla";
		Sino
			Escribir "Entra a liguilla de campeonato";
		FinSi
	FinSi
FinProceso
