export interface ICliente {
  id?: number;
  dni?: string;
  name?: string | null;
  numeroCompras?: number | null;
  tier?: string | null;
}

export class Cliente implements ICliente {
  constructor(
    public id?: number,
    public dni?: string,
    public name?: string | null,
    public numeroCompras?: number | null,
    public tier?: string | null
  ) {}
}

export function getClienteIdentifier(cliente: ICliente): number | undefined {
  return cliente.id;
}
