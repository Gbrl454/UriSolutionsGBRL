const input = require("fs").readFileSync("dev/stdin", "utf8");
const lines = input.split("\n");

// Idade em Dias

// Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

// Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

// Entrada
// O arquivo de entrada contém um valor inteiro.

// Saída
// Imprima a saída conforme exemplo fornecido.

let idadeDias = parseInt(lines.shift());

const ANO = 365;
const MES = 30;

let qAnos = Math.trunc(idadeDias / ANO);
idadeDias -= qAnos * ANO;
let qMeses = Math.trunc(idadeDias / MES);
idadeDias -= qMeses * MES;

console.log(qAnos + " ano(s)");
console.log(qMeses + " mes(es)");
console.log(idadeDias + " dia(s)");




// REVISAR