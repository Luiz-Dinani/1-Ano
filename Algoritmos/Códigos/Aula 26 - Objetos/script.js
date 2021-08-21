let coresCasas = [
	'preto e branco',
	'verde e branco',
	'marrom e cinza'
 ];

let linha = ['1','2','3','4','5','6','7','8'];

let coluna = ['a','b','c','d','e','f','g','h'];

let listaTipos = [
	'peão',
	'cavalo',
	'bispo',
	'torre',
	'dama',
	'rei'
];
	
let coresPecas = [
	'escura',
	'clara'
];	

let	Peca = {
		id:"",
		cor:coresPecas,
		tipo:listaTipos,
		capturada:false,
		posicao:function(){
			Tabuleiro.getCoordenada(Peca);	
		},
	
		capturar :function(){
      Jogador.fazerLance();
			alert('peça capturada');
      Peca.capturada = true;
		},
	 
		mover:function(){
			alert('movendo');
		},	 	
	}
	  
let Jogador = {
		nome : 'Krikor',
		idade: 34,
		rating : 2550,
		titulo:'GM',
		ladoTabuleiro: 'preto',
		
		fazerLance: function(){
			alert('lance feito')
		},
		
		oferecerEmpate:function(){
			alert('empate?')
		},
		
		desistir:function(){
			alert('Tu é capivara rapaiz')
    }
}

let Tabuleiro = {
	cores :coresCasas,
	posicaoInicial : true,
	pecas : listaTipos,
	marcaTabuleiro:'mequinho',
	jogadorBranco:Jogador.nome,
	jogadorPreto:Jogador.nome,
	coordenada: [linha,coluna]
}