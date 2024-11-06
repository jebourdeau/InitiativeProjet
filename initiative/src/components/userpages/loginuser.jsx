import "../../styles/login.css";

export const Loginuser = () => {
    return (
    <>
        <div>
            <h3>Connectez-vous</h3>
            <form className="login-case">
                <label title="Identifiant">Identifiant</label>
                <input type='text' name='Identifiant' placeholder='Identifiant'/>
                <label title="mot_de_passe">Mot de Passse</label>
                <input type='text' name='Mot de passe' placeholder='Password'/>
                <input type='submit' className='button_submit'></input>
            </form>
            </div>
    </>
    );
};