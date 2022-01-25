import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'cliente',
        data: { pageTitle: 'concesionarioPruebaApp.cliente.home.title' },
        loadChildren: () => import('./cliente/cliente.module').then(m => m.ClienteModule),
      },
      {
        path: 'coche',
        data: { pageTitle: 'concesionarioPruebaApp.coche.home.title' },
        loadChildren: () => import('./coche/coche.module').then(m => m.CocheModule),
      },
      {
        path: 'empleado',
        data: { pageTitle: 'concesionarioPruebaApp.empleado.home.title' },
        loadChildren: () => import('./empleado/empleado.module').then(m => m.EmpleadoModule),
      },
      {
        path: 'venta',
        data: { pageTitle: 'concesionarioPruebaApp.venta.home.title' },
        loadChildren: () => import('./venta/venta.module').then(m => m.VentaModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
