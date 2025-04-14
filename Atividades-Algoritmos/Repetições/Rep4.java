4 - Faça um programa que apresente o menu abaixo 
e pare de apresenta-lo quando o usuário digitar 
a opção S.

"N. Novo arquivo
A. Abrir arquivo
F. Fechar arquivo
S. Sair"

Quando o usuário escolher N exibir 
"novo arquivo criado com sucesso!",
quando o usuário escolher A exibir 
"Abrindo arquivo!", quando o usuário
escolher F exibir "Arquivo fechado com sucesso!" 
e quando o usuário escolher
S exibir "Obrigado por utilizar o sistema!".
Obs:Utilize laço "Para" e outras estruturas 
que julgar necessárias.

Algoritmo <Arquivo>

var
escolha: Caractere

Inicio
para(i=0, i==0, i++) faça
	Escreva ("Digite: N Novo arquivo")
	Escreva ("Digite: A Abrir arquivo")
	Escreva ("Digite: F Fechar arquivo")
	Escreva ("Digite: S Para sair")

	Leia ("Digite sua opção"), escolha

	Se (escolha == "N")
		Escreva ("novo arquivo criado com sucesso!")
		i = 0
	Senao Se (escolha == "A")
		Escreva ("Abrindo arquivo!")
		i = 0
	Senao Se (escolha == "F")
		Escreva ("Arquivo fechado com sucesso!")
		i = 0
	Senao Se (escolha = "S")	
		Escreva ("Arquivo fechado com sucesso!")
	Senao
		Escreva ("Valor incorreto")
Fim para
fim
