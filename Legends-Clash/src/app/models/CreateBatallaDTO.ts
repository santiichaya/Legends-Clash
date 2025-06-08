import Personaje from './Personaje'

export default interface CreateBatallaDTO {
  nombre:string,
  nombreEquipo1:string,
  nombreEquipo2:string,
  personajes1: Personaje[],
  personajes2: Personaje[],
}
