import dayjs from 'dayjs/esm';
import { IEmpleado } from 'app/entities/empleado/empleado.model';
import { ICliente } from 'app/entities/cliente/cliente.model';
import { ICoche } from 'app/entities/coche/coche.model';

export interface IVenta {
  id?: number;
  fecha?: dayjs.Dayjs | null;
  tipoPago?: string | null;
  total?: number | null;
  empleado?: IEmpleado | null;
  cliente?: ICliente | null;
  coches?: ICoche[] | null;
}

export class Venta implements IVenta {
  constructor(
    public id?: number,
    public fecha?: dayjs.Dayjs | null,
    public tipoPago?: string | null,
    public total?: number | null,
    public empleado?: IEmpleado | null,
    public cliente?: ICliente | null,
    public coches?: ICoche[] | null
  ) {}
}

export function getVentaIdentifier(venta: IVenta): number | undefined {
  return venta.id;
}
