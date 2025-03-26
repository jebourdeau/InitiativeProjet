import { apiRequest } from './apiService';

export async function login(username, password) {
  return apiRequest('/api/auth/loginuser', {
    method: 'POST',
    body: JSON.stringify({ username, password })
  });
};

export async function register(username, password) {
  return apiRequest('/api/auth/registeruser', {
    method: 'POST',
    body: JSON.stringify({ username, password })
  });
};
