Proceso sin_titulo
	cont_etapa<-0;
	tiempo_com1<-0;
	tiempo_com2<-0;
	tiempo_com3<-0;
	tiempo_com4<-0;
	tiempo_com5<-0;
	tiempo_com6<-0;
	tiempo_com7<-0;
	tiempo_com8<-0;
	tiempo_com9<-0;
	tiempo_com10<-0;
	Escribir "Ingrese nombre y apellido de los 10 competidores";
	Leer comp1,comp2,comp3,comp4,comp5,comp6,comp7,comp8,comp9,comp10;
	Repetir
		cont_etapa<-cont_etapa+1;
		Escribir "Etapa N°",cont_etapa;
		Escribir "Ingrese la cantidad de tramos que tiene la etapa";
		Leer cant_tramo;
		Para num_comp<-1 Hasta 10 Con Paso 1 Hacer
			cont_tramo<-0;
			tiempo_etapa<-0;
			best_T<-10000000;
			Escribir "Competidor N°",num_comp;
			Repetir
				cont_tramo<-cont_tramo+1;
				Escribir "Ingrese el tiempo del competidor en el tramo: ",cont_tramo,"(Hrs:Min:Seg)";
				Leer H,M,S;
				S<-(h*3600)+(M*60)+S;
				sPorEtapa<-S-tiempo_etapa;
				//borrar
				Escribir "Tiempo de la etapa ",sPorEtapa;
				tiempo_etapa<-S;
				//borrar
				Escribir "Tiempo T ",tiempo_etapa;
				si(sPorEtapa<best_T)entonces
					best_T<-sPorEtapa;
					tramot<-cont_Tramo;
					//borrar
					Escribir "mejor tiempo ",best_T;
				FinSi
			Hasta Que cont_tramo==cant_tramo
			h_tramo<-trunc(best_T/3600);
			min_tramo<-trunc((best_T%3600)/60);
			s_tramo<-trunc((best_T%3600)%60);
			Escribir "Competidor ",num_comp,", etapa ",cont_etapa;
			Escribir "Mejor tiempo fue en el tramo: ",tramot," con ",h_tramo,":",min_tramo,":",s_tramo;
			Segun num_comp Hacer
				1:
					tiempo_com1<-tiempo_etapa+tiempo_com1;
					best_com1<-best_T;
					primer<-comp1;
				2:
					tiempo_com2<-tiempo_etapa+tiempo_com2;
					best_com2<-best_T;
					si(best_com2<best_com1)entonces
						primer<-comp2;
						second<-comp1;
					Sino
						primer<-comp1;
						second<-comp2;
					FinSi
				3:
					tiempo_com3<-tiempo_etapa+tiempo_com3;
					best_com3<-best_T;
				4:
					tiempo_com4<-tiempo_etapa+tiempo_com4;
					best_com4<-best_T;
				5:
					tiempo_com5<-tiempo_etapa+tiempo_com5;
					best_com5<-best_T;
				6:
					tiempo_com6<-tiempo_etapa+tiempo_com6;
					best_com6<-best_T;
				7:
					tiempo_com7<-tiempo_etapa+tiempo_com7;
					best_com7<-best_T;
				8:
					tiempo_com8<-tiempo_etapa+tiempo_com8;
					best_com8<-best_T;
				9:
					tiempo_com9<-tiempo_etapa+tiempo_com9;
					best_com9<-best_T;
				10:
					tiempo_com10<-tiempo_etapa+tiempo_com10;
					best_com10<-best_T;
			FinSegun
		FinPara
		
	Hasta Que (cont_etapa==5)
FinProceso
