
import './App.css';
import Header from './components/structure/header';
import Footer from './components/structure/footer';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Contact } from './components/pages/contact';
import { Apropos } from './components/pages/apropos';
import BoiteOutils from './components/pages/boitesOutils/boite_à_outils';
import { Outils } from './components/pages/boitesOutils/outils';
import { Photos } from './components/pages/boitesOutils/photos';
import Rendezvous from './components/pages/boitesOutils/rendezvous';
import NotFound from './components/pages/notFound';
import { Registeruser } from './components/userpages/registeruser';
import { Loginuser } from './components/userpages/loginuser';



function App() {
  return (
    <BrowserRouter>
    <Header/>
    <Routes>
        <Route path="/notfound" element={<NotFound/>} />
        <Route path="/contact" element={<Contact/>} />
        <Route path="/apropos" element={<Apropos/>} />
        <Route path="/login" element={<Loginuser/>} />
        <Route path="/register" element={<Registeruser/>} />
        <Route path="/boites-outils" element={<BoiteOutils/>} />
        <Route path="/outils" element={<Outils/>} />
        <Route path="/photos" element={<Photos/>} />
        <Route path="/rendezvous" element={<Rendezvous/>} />
    </Routes>
    <Footer/>
  </BrowserRouter>
  );
}

export default App;
