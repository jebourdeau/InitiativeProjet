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
            <div>
                    <label>
                        <input type="radio" name="role" value="porteur de projet" />
                        Porteur de projet
                    </label>
                    <label>
                        <input type="radio" name="role" value="parrain" />
                        Parrain
                    </label>
                </div>
                <input type='submit' className='button_submit'></input>
            </form>
            </div>
    </>
    );
};