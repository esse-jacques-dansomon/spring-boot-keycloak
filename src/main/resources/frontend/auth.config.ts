import { AuthConfig } from 'angular-oauth2-oidc';

export const authconfig: AuthConfig = {
  issuer: 'http://localhost:8080/realms/oauth2-demo-realm',
  redirectUri: window.location.origin,
  clientId: 'oauth2-demo-pkce-client',
  responseType: 'code',
  strictDiscoveryDocumentValidation: true,
  scope: 'openid profile email offline_access',
}
