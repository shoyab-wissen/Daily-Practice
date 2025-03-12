import { Injectable } from '@angular/core';
import {
  ActivatedRouteSnapshot,
  CanActivate,
  CanActivateFn,
  GuardResult,
  MaybeAsync,
  RouterStateSnapshot,
} from '@angular/router';
import { RoleService } from '../services/role.service';

@Injectable({
  providedIn: 'root',
})
export class WelcomeGuard implements CanActivate {
  constructor(private roleService: RoleService) {}
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ): MaybeAsync<GuardResult> {
    if (this.roleService.role == route.data[0]) return true;
    return false;
  }
}
