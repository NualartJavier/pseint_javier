Proceso sin_titulo
	turno<-0;
	avance1<-0;
	avance2<-0;
	avance3<-0;
	Escribir "Jumanji";
	Repetir
		Escribir "Juega jugador 1";
		Escribir "Turno N°",turno+1;
		Escribir "Oprima una tecla para lanzar los dados";
		esperar tecla;
		dado1<-azar(6)+1;
		dado2<-azar(6)+1;
		Escribir "Dado1: ",dado1;
		Escribir "Dado2: ",dado2;
		avance1<-avance1+dado1+dado2;
		Escribir "Avanza hasta la casilla N°",avance1;
		Si avance1%2 = 0 y avance1<>2 o avance1 <= 1 o avance1%3 = 0 y avance1<>3 o avance1%5 = 0 y avance1<>5 Entonces 
			si avance1==13 Entonces
				Escribir "Caistes en la casilla N°13, Debes volver al inicio";
				avance1<-0;
			Sino
				si(avance1%10==0)entonces
					Escribir "Caistes en una casilla multiplo de 10, Avanza 5 casillas";
					avance1<-avance1+5;
				Sino
					si(avance1%2==0)entonces
						Escribir "Caistes en una casilla par, Avanza 2 casillas";
						avance1<-avance1+2;
					Sino
						Escribir "Caistes en una casilla impar,retrocede 1 casilla";
						avance1<-avance1-1;
					FinSi
				FinSi
			FinSi
		Sino 
			Escribir "caiste en una casilla numero primo, vuelve al primo anterior";
			cont<-0;
			Repetir
				Si cont%2 = 0 y cont<>2 o cont <= 1 o cont%3 = 0 y cont<>3 o cont%5 = 0 y cont<>5 Entonces 
					asd<-1;
				Sino
					prim<-cont;
				FinSi
				cont<-cont+1;
			Hasta Que (cont=avance1)
			avance1<-prim;
		FinSi
		Escribir "Casilla actual ",avance1;
		//jugador 2
		Escribir "Juega jugador 2";
		Escribir "Turno N°",turno+1;
		Escribir "Oprima una tecla para lanzar los dados";
		esperar tecla;
		dado1<-azar(6)+1;
		dado2<-azar(6)+1;
		Escribir "Dado1: ",dado1;
		Escribir "Dado2: ",dado2;
		avance2<-avance2+dado1+dado2;
		Escribir "Avanza hasta la casilla N°",avance2;
		Si avance2%2 = 0 y avance2<>2 o avance2 <= 1 o avance2%3 = 0 y avance2<>3 o avance2%5 = 0 y avance2<>5 Entonces 
			si avance2==13 Entonces
				Escribir "Caistes en la casilla N°13, Debes volver al inicio";
				avance2<-0;
			Sino
				si(avance2%10==0)entonces
					Escribir "Caistes en una casilla multiplo de 10, Avanza 5 casillas";
					avance2<-avance2+5;
				Sino
					si(avance2%2==0)entonces
						Escribir "Caistes en una casilla par, Avanza 2 casillas";
						avance2<-avance2+2;
					Sino
						Escribir "Caistes en una casilla impar,retrocede 1 casilla";
						avance2<-avance2-1;
					FinSi
				FinSi
			FinSi
		Sino 
			Escribir "caiste en una casilla numero primo, vuelve al primo anterior";
			cont<-0;
			Repetir
				Si cont%2 = 0 y cont<>2 o cont <= 1 o cont%3 = 0 y cont<>3 o cont%5 = 0 y cont<>5 Entonces 
					asd<-1;
				Sino
					prim<-cont;
				FinSi
				cont<-cont+1;
			Hasta Que (cont=avance2)
			avance2<-prim;
		FinSi
		Escribir "Casilla actual ",avance2;
		//jugador3
		Escribir "Juega jugador 3";
		Escribir "Turno N°",turno+1;
		Escribir "Oprima una tecla para lanzar los dados";
		esperar tecla;
		dado1<-azar(6)+1;
		dado2<-azar(6)+1;
		Escribir "Dado1: ",dado1;
		Escribir "Dado2: ",dado2;
		avance3<-avance3+dado1+dado2;
		Escribir "Avanza hasta la casilla N°",avance3;
		Si avance3%2 = 0 y avance3<>2 o avance3 <= 1 o avance3%3 = 0 y avance3<>3 o avance3%5 = 0 y avance3<>5 Entonces 
			si avance3==13 Entonces
				Escribir "Caistes en la casilla N°13, Debes volver al inicio";
				avance3<-0;
			Sino
				si(avance3%10==0)entonces
					Escribir "Caistes en una casilla multiplo de 10, Avanza 5 casillas";
					avance3<-avance3+5;
				Sino
					si(avance3%2==0)entonces
						Escribir "Caistes en una casilla par, Avanza 2 casillas";
						avance3<-avance3+2;
					Sino
						Escribir "Caistes en una casilla impar,retrocede 1 casilla";
						avance3<-avance3-1;
					FinSi
				FinSi
			FinSi
		Sino 
			Escribir "caiste en una casilla numero primo, vuelve al primo anterior";
			cont<-0;
			Repetir
				Si cont%2 = 0 y cont<>2 o cont <= 1 o cont%3 = 0 y cont<>3 o cont%5 = 0 y cont<>5 Entonces 
					asd<-1;
				Sino
					prim<-cont;
				FinSi
				cont<-cont+1;
			Hasta Que (cont=avance3)
			avance3<-prim;
		FinSi
		Escribir "Casilla actual ",avance3;
		turno<-turno+1;
	Hasta Que (avance1>27 o avance2>27 o avance3>27)
	si(avance1>27)Entonces
		Escribir "El ganador es el jugador 1, con ",turno," jugadas";
	Sino
		si(avance2>27)Entonces
			Escribir "El ganador es el jugador 2, con ",turno," jugadas";
		Sino
			escribir "El ganador es el jugador 3, con ",turno," jugadas";
		FinSi
	FinSi
	
FinProceso
