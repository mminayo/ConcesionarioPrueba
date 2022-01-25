import { IVenta } from 'app/entities/venta/venta.model';

export interface ICoche {
  id?: number;
  marca?: string | null;
  modelo?: string | null;
  color?: string | null;
  precio?: number | null;
  numeroSerie?: number | null;
  transpuesto?: string | null;
  venta?: IVenta | null;
}

export class Coche implements ICoche {
  constructor(
    public id?: number,
    public marca?: string | null,
    public modelo?: string | null,
    public color?: string | null,
    public precio?: number | null,
    public numeroSerie?: number | null,
    public transpuesto?: string | null,
    public venta?: IVenta | null
  ) {}
}

export function getCocheIdentifier(coche: ICoche): number | undefined {
  return coche.id;
}
