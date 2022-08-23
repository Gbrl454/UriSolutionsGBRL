const input = require("fs").readFileSync("dev/stdin", "utf8");
const lines = input.split("\n");

// Conversão de Tempo

// Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

// Entrada
// O arquivo de entrada contém um valor inteiro N.

// Saída
// Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

let n = parseInt(lines.shift());

let m = parseInt(n / 60);
n -= m * 60;

const h = parseInt(m / 60);
m -= h * 60;

console.log(h + ":" + m + ":" + n);
