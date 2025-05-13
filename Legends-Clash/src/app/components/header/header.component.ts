import { NgClass } from '@angular/common';
import { Component, OnDestroy } from '@angular/core';
import { MatIconModule } from '@angular/material/icon';
import { NavigationEnd, Router, RouterLink } from '@angular/router';
import { filter, Subscription } from 'rxjs';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [MatIconModule, NgClass, RouterLink],
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
})
export class HeaderComponent implements OnDestroy {
  light: boolean = false;
  private routerSubscription: Subscription;

  constructor(private router: Router) {
    this.routerSubscription = this.router.events
      .pipe(filter((event): event is NavigationEnd => event instanceof NavigationEnd))
      .subscribe((event: NavigationEnd) => {
        this.light = this.shouldActivateLight(event.urlAfterRedirects);
      });
  }

  private shouldActivateLight(url: string): boolean {
    // Lista de rutas donde `light` debe ser true
    return ['/batallas', '/otra-ruta'].includes(url);
  }

  ngOnDestroy(): void {
    this.routerSubscription.unsubscribe();
  }
}
