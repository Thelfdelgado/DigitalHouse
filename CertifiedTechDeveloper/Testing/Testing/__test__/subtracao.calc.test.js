const { subtracao } = require('../calc.js');

describe('Testes de subtracao', () =>{

    test('subtracao de dois numeros', () =>{
        expect(subtracao(5,3)).toBe(2);
    })

    test('subtracao de dois zeros', () =>{
        expect(subtracao(0,0)).toBe(0);
    })

    test('subtracao de negativos', () =>{
        expect(subtracao(-1,4)).toBe(-5);
    })

    test('subtracao de strings', () =>{
        expect(subtracao("a","b")).toBe(NaN);
    })

})