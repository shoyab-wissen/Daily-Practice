import { add } from './testingfunction';

describe('Calculation Tests', () => {
  it('should add two numbers', () => {
    expect(add(1, 2)).toBe(3);
  });
});

describe('String Testing', () => {
  it('using "toBe"', () => {
    expect('hello').toBe('hello');
  });
  it('using "toEqual"', () => {
    expect('hello').toEqual('hello');
  });
});

describe('Testing with deep checking', () => {
  it('using "toEqual"', () => {
    let e1 = { name: 'shoyab', age: 22 };
    expect(e1).toEqual({ name: 'shoyab', age: 22 });
  });
  it('using "toBe"', () => {
    let e1 = { name: 'shoyab', age: 22 };
    expect(e1).toBe(e1);
  });
});
